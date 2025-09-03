package shapes;

class Pyramid {
    public static void main(String[] args) {
        int lineIteration;
        int totalLines = 21;
        int center = (totalLines / 2) + 1; // 4
        int centerShifter = center;
        int oppositeCenter = center;

        System.out.println();

        for(int currentLine = 1; currentLine <= totalLines; currentLine++) {
            if(currentLine % 2 != 0) {
                for(lineIteration = 1; lineIteration <= totalLines; lineIteration++) {
                    if(lineIteration >= center && lineIteration <= oppositeCenter) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                centerShifter--;
                oppositeCenter++;
                center = centerShifter;
                System.out.println();
            }
        }

        System.out.println();
    }
}

