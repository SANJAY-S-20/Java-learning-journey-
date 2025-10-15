public enum Operation {

        DEPOSIT(1),
        WITHDRAW(2),
        CHECK(3),
        INTEREST(4),
        EXIT(5);

        private int value;

        Operation(int v){
            this.value = v;
        }

        public int getValue() {
            return value;
        }

    public static Operation choice(int a) {
        Operation[] ops = Operation.values();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].getValue() == a) {
                return ops[i];
            }
        }
        return null;
    }
}



