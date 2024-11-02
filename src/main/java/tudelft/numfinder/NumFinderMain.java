package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[] {1,2,3,1});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
