package com.stepstone.stepper.internal.widget.pagetransformer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.viewpager.widget.ViewPager;

import com.stepstone.stepper.R;

import static androidx.annotation.RestrictTo.Scope.LIBRARY;

/**
 * Creates a page transformer to be used by {@link com.stepstone.stepper.internal.widget.StepViewPager}.
 *
 * @author Piotr Zawadzki
 */
@RestrictTo(LIBRARY)
public final class StepPageTransformerFactory {

    private StepPageTransformerFactory() {
    }

    /**
     * Creates a {@link ViewPager.PageTransformer}.
     * If layout direction is in RTL it returns {@link StepperRtlPageTransformer}, <i>null</i> otherwise.
     * @param context context
     * @return page transformer
     */
    @Nullable
    public static ViewPager.PageTransformer createPageTransformer(@NonNull Context context) {
        boolean rtlEnabled = context.getResources().getBoolean(R.bool.ms_rtlEnabled);
        return rtlEnabled ? new StepperRtlPageTransformer() : null;
    }

}
