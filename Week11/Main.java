// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape shape0;
        Shape_2D shape1;
        Shape_3D shape2;
        Circle circle1 = new Circle("Circle1", 5);
        Rectangle r1= new Rectangle("Rectangle1", 7 ,6.5);
        Sphere s1 = new Sphere("Sphere1", 7.8);
        Cube c1 = new Cube("Cube1", 9);
        System.out.printf("Area of Circle1: %f",circle1.area());
        System.out.printf("\nArea of Rectangle1: %f",r1.area());
        System.out.printf("\nSurface Area of Sphere: %f", s1.area());
        System.out.printf("\nVolume of Sphere1: %f", s1.volume());
        System.out.printf("\nSurface area of Cube1: %f", c1.area());
        System.out.printf("\nVolume of Cube1: %f\n", c1.volume());

        Shape[] shapes = new Shape[20];
        shapes[0] = new Circle("Circle2", 7);
        shapes[1] = new Circle("Circle3",8);
        shapes[2] = new Circle("Circle4",6);
        shapes[3] = new Circle("Circle5",9);
        shapes[4] = new Circle("Circle6",17);
        shapes[5] = new Rectangle("Rectangle2",13,5);
        shapes[6] = new Rectangle("Rectangle3",11,7);
        shapes[7] = new Rectangle("Rectangle4",10.5,5.6);
        shapes[8] = new Rectangle("Rectangle5",13.7,55);
        shapes[9] = new Rectangle("Rectangle6",14.8,21.3);
        shapes[10] = new Sphere("Sphere2",2.43);
        shapes[11] = new Sphere("Sphere3",5.97);
        shapes[12] = new Sphere("Sphere4",13.45);
        shapes[13] = new Sphere("Sphere5",8.6);
        shapes[14] = new Sphere("Sphere6",7.7);
        shapes[15] = new Cube("Cube2",55.89);
        shapes[16] = new Cube("Cube3",42.6);
        shapes[17] = new Cube("Cube4",35.7);
        shapes[18] = new Cube("Cube5",44.6);
        shapes[19] = new Cube("Cube6",23.9);

        for (int c = 0; c<=19; c++){
            if(shapes[c] instanceof Cube){
                System.out.printf("Area of " + shapes[c].getName() + ": %f\n",shapes[c].area());
                System.out.printf("Volume of " + shapes[c].getName() + ": %f\n",((Cube)shapes[c]).volume());
            } else if (shapes[c] instanceof  Sphere) {
                System.out.printf("Area of " + shapes[c].getName() + ": %f\n",shapes[c].area());
                System.out.printf("Volume of " + shapes[c].getName() + ": %f\n",((Sphere)shapes[c]).volume());
            } else{
                System.out.printf("Area of " + shapes[c].getName() + ": %f\n",shapes[c].area());
            }
        }
        int circlc, rectanglec, cubec, spherec;
        circlc = 0;
        rectanglec = 0;
        cubec = 0;
        spherec = 0;
        for (int n = 0;n<=19;n++){
            if (shapes[n] instanceof Circle){
                circlc++;
            } else if (shapes[n] instanceof Rectangle) {
                rectanglec++;
            } else if (shapes[n] instanceof Sphere) {
                spherec++;
            } else{
                cubec++;
            }
        }
        System.out.printf("\nThere were a total of " + circlc + " instances of Circle Class," + rectanglec + " instances of Rectangle Class," + spherec + " instances of Sphere class and " + cubec + " instances of the Cube CLass.");
        DuplicateCheck(Shape[] shapes);
    }
}