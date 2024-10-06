package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "라라랜드";
        movieReview1.review = "ㅈ같음";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "아이언맨";
        movieReview2.review = "재밌음";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for(int i=0; i<movieReviews.length; i++){
            System.out.println("영화제목: "+movieReviews[i].title+ ", 영화리뷰:"+movieReviews[i].review);
        }
    }
}
