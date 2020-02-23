public class ReviewDriver {

    public static void main(String[]args) {
       /* System.out.println(Review.sentimentVal("happily"));
        System.out.println(Review.sentimentVal("math"));
        System.out.println(Review.sentimentVal("candy"));
        System.out.println(Review.sentimentVal("finger"));
        System.out.println(Review.sentimentVal("0"));*/

        System.out.println(Review.totalSentiment("reviewFile.txt"));
        System.out.println(Review.totalSentiment("26WestReview.txt"));




    }
}
