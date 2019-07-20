package com.stepstone.stepper.sample.adapter

import android.content.Context
import androidx.annotation.IntRange
import androidx.fragment.app.FragmentManager

import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.sample.R
import com.stepstone.stepper.sample.step.fragment.DelayedTransitionStepFragmentSample
import com.stepstone.stepper.viewmodel.StepViewModel

class DelayedTransitionFragmentStepAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        return DelayedTransitionStepFragmentSample.newInstance()
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        return StepViewModel.Builder(context)
                .setTitle(R.string.tab_title)
                .create()
    }

    override fun getCount(): Int {
        return 3
    }
}