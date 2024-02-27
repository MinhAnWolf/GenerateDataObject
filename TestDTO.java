public class TestDTO {
    private String feldString;
    private float feldFloat;
    private Integer feldInteger;
    private Double feldDouble;
    private Object feldObj;
    private Long rcn;

    public String getFeldString() {
        return feldString;
    }

    public void setFeldString(String feldString) {
        this.feldString = feldString;
    }

    public float getFeldFloat() {
        return feldFloat;
    }

    public void setFeldFloat(float feldFloat) {
        this.feldFloat = feldFloat;
    }

    public Integer getFeldInteger() {
        return feldInteger;
    }

    public void setFeldInteger(Integer feldInteger) {
        this.feldInteger = feldInteger;
    }

    public Double getFeldDouble() {
        return feldDouble;
    }

    public void setFeldDouble(Double feldDouble) {
        this.feldDouble = feldDouble;
    }

    public Object getFeldObj() {
        return feldObj;
    }

    public void setFeldObj(Object feldObj) {
        this.feldObj = feldObj;
    }

    public Long getRcn() {
        return rcn;
    }

    public void setRcn(Long rcn) {
        this.rcn = rcn;
    }

    @Override
    public String toString() {
        return "testDTO{" +
                "feldString='" + feldString + '\'' +
                ", feldFloat=" + feldFloat +
                ", feldInteger=" + feldInteger +
                ", feldDouble=" + feldDouble +
                ", feldObj=" + feldObj +
                ", rcn=" + rcn +
                '}';
    }
}
