package di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

    @Provides
    @Singleton
    public RetrofitService getRetrofitService(Retrofit retrofit){
        return retrofit.create(RetrofitService.class);
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(){

        return new Retrofit.Builder()
                .baseUrl("http://3esavers.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
