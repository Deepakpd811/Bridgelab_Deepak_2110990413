package java_7_feb.LineComparision;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public double getSlope() {
        return (end.getY() - start.getY()) / (end.getX() - start.getX());
    }

    public boolean isPrallel(Line line){
        return this.getSlope() == line.getSlope();
    }

    public static void main(String[] args) {
        Point p1 = new Point(6, 4);
        Point p2 = new Point(2, 3);

        Point p3 = new Point(5, 2);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p3);

        System.out.println(l1.getSlope());
        System.out.println(l1.isPrallel(l2));
    }

}
