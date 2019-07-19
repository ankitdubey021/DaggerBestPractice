package di;

import com.ebiztechnocrats.daggerdemo1withcontext.MainActivity;
import javax.inject.Singleton;
import dagger.Component;


@Component(modules = {ContextModule.class,RetrofitModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
}
