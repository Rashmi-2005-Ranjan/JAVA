package in.kgcoding.polymorphism.passby.value;

public class TestPassByReference {
    public static void main(String[] args) {
        Point first = new Point ( 4,8 );
        System.out.printf ( "Point before move: %s%n", first );
        move ( first );
        System.out.printf ( "Point after move: %s%n", first );
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.printf ( "Point moved to (%d, %d)%n", p.x, p.y );
    }
    public static class Point{
        int x;
        int y;

        public Point(int x , int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder ( "Point{" );
            sb.append ( "x=" ).append ( x );
            sb.append ( ", y=" ).append ( y );
            sb.append ( '}' );
            return sb.toString ( );
        }
    }
}
