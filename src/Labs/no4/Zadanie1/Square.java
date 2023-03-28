package Labs.no4.Zadanie1;

public class Square {
        String name;
        double base;
        public double Field(double base){
            double field = Math.pow(base, 2);
            return field;
        }
        public double Circut(double base){
            double circut = 4 * base;
            return circut;
        }
        public void Params(){
            System.out.println("Wybrana figura: "+this.getName());
            System.out.println("Podstawa kwadratu wynosi: "+this.base);
            System.out.println("Pole wynosi: "+this.Field(base));
            System.out.println("Obwód wynosi: "+this.Circut(base));
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBase(double base) {
            this.base = base;
        }


        public String getName() {
            return name;
        }

        public double getBase() {
            return base;
        }
    }
