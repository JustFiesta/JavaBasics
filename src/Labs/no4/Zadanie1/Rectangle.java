package Labs.no4.Zadanie1;

public class Rectangle {
        String name;
        double base, side;
        public double Field(double base, double side){
            double field = base * side;
            return field;
        }
        public double Circut(double base, double side){
            double circut = 2 * base + 2 * side;
            return circut;
        }
        public void Params(){
            System.out.println("Wybrana figura: "+this.getName());
            System.out.println("Podstawa prostokąta wynosi: "+this.base+" a bok wynosi: "+this.side);
            System.out.println("Pole wynosi: "+this.Field(base, side));
            System.out.println("Obwód wynosi: "+this.Circut(base, side));
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBase(double base) {
            this.base = base;
        }
        public void setSide(double side) {
            this.side = side;
        }

        public String getName() {
            return name;
        }

        public double getBase() {
            return base;
        }
    }
