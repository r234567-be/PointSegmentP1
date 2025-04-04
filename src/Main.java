//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // composition
        SegmentCompo  sc = new SegmentCompo(0, 0, 5, 5) ;

       // System.out.println(sc.toString());
        Point pt1 = new Point (1,1 ) ;
        Point pt2 = new Point (6,6 ) ;

        SegmentAgreeg sa = new SegmentAgreeg(pt1, pt2);
        System.out.println(pt1.toStirng());

        System.out.println(sa.toString());
        }
    }

