
class FactorialException extends Exception {
    private int num;

    public FactorialException(int num) {
        super("Invalid input: Factorial is not defined for this number");
        this.num = num;
    }

    @Override
    public String toString() {
        return super.getMessage() + " - Number: " + num;
    }
}
