package di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context appContext;

    public ContextModule(Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    Context contextPrivider(){
        return appContext;
    }
}
