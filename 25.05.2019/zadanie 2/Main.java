public class Main {

    public static void main(String[] args){
        GeometricObject geometricObject1 = new Circle(3.0);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1.getArea());

        Resizable geometricObject2 = new ResizableCircle(7.0);
        System.out.println(geometricObject2);
        geometricObject2.resize(90);
        System.out.println(geometricObject2);

        GeometricObject geometricObject3 = (GeometricObject) geometricObject2;
        System.out.println(geometricObject3);
        System.out.println(geometricObject3.getPerimeter());
        System.out.println(geometricObject3.getArea());
    }
}
