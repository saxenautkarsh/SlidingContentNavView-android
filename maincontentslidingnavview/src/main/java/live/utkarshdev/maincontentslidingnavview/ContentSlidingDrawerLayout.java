package live.utkarshdev.maincontentslidingnavview;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ContentSlidingDrawerLayout extends DrawerLayout {

    View content;

    public ContentSlidingDrawerLayout(Context context) {
        super(context);
    }

    public ContentSlidingDrawerLayout(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    public ContentSlidingDrawerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context,attrs,defStyle);
    }
        public void init(Activity activity,NavigationView navigationView){
        this.setScrimColor(Color.TRANSPARENT);
        this.setDrawerElevation(0f);
        content = getChildAt(0);
        if(content==null){
            return;
        }

        int width = 2*(activity.getResources().getDisplayMetrics().widthPixels/3);

        ViewGroup.LayoutParams params = navigationView.getLayoutParams();
        params.width = width;
        navigationView.setLayoutParams(params);

        ActionBarDrawerToggle abdt=new ActionBarDrawerToggle(activity,this,R.string.open,R.string.close){

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                float slideX = drawerView.getWidth() * slideOffset;
                content.setTranslationX(slideX);
                content.setScaleX(1 - (slideOffset/7));
                content.setScaleY(1 - (slideOffset/7));
            }
        };

        this.addDrawerListener(abdt);
        abdt.syncState();
        
    }

    public void init(Activity activity, NavigationView navigationView, ActionBar actionBar){
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        init(activity,navigationView);
    }

}
