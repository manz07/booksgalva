package com.galva.addressbook;

        import java.util.List;

        import retrofit2.Call;

        import retrofit2.http.GET;
        import retrofit2.http.Query;


public interface ApiInterface {

    @GET("addressbook.php")
    Call < List<Books> > getBooks( @Query("people") String keyword);
}

