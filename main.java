import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Random;

public class main {
    private static Random random = new Random();

    public static void main(String[] args) throws IOException {
        TestDTO dto = new TestDTO();
        createDataDto(dto);
        System.out.println(dto);
    }

    public static void createDataDto(TestDTO testDTO) {
        for (Field field : testDTO.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                var fieldType = field.getType();
                field.set(testDTO, checkType(fieldType));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Object checkType(Class<?> type) {
        if (type.equals(String.class)) {
            return randomString();
        } else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
            return randomInterger();
        } else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
            return randomFloat();
        } else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
            return randomDouble();
        } else if (type.equals(Boolean.TYPE) || type.equals(Boolean.class)) {
            return true;
        } else if (type.equals(Byte.TYPE) || type.equals(Byte.class)) {
            return randomByte();
        } else if (type.equals(Object.class)) {
            return returnObj();
        } else if (type.equals(Long.class)) {
            return randomLong();
        }
        return null;
    }

    private static String randomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int lenght = 10;
        StringBuilder sb = new StringBuilder(lenght);

        for (int i = 0; i < lenght; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    private static Integer randomInterger() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }

    private static Float randomFloat() {
        return random.nextFloat();
    }

    private static Double randomDouble() {
        return random.nextDouble();
    }

    private static Byte randomByte() {
        return (byte) (Math.random() * 256);
    }

    private static Object returnObj() {
        return new Object();
    }

    private static Object randomLong() {
        return random.nextLong();
    }
}