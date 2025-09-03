package shapes;

class Triangle {
    public static void main(String[] args) {
        hollowTriangle(6);
    }    

    // Normal triangle
    public static void normalTriangle(int noOfLines) {
        int lineIteration;

        for(int currentLine = 1; currentLine <= noOfLines; currentLine++) {
            for(lineIteration = 1; lineIteration <= currentLine; lineIteration++) {
                System.out.print(" * ");
            }
            
            System.out.println();
        }
    }
    
    // Hollow triangle
    public static void hollowTriangle(int totalLines) {
        int lineIteration;
        for(int currentLine = 1; currentLine <= totalLines; currentLine++) {
            for(lineIteration = 1; lineIteration <= currentLine; lineIteration++) {
                if((currentLine >= 3 && currentLine < totalLines) && (lineIteration > 1 && lineIteration < currentLine)) {
                    System.out.print("   ");
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

