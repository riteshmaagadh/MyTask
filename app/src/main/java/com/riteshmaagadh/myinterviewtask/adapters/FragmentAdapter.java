package com.riteshmaagadh.myinterviewtask.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.riteshmaagadh.myinterviewtask.fragments.FifthFragment;
import com.riteshmaagadh.myinterviewtask.fragments.FirstFragment;
import com.riteshmaagadh.myinterviewtask.fragments.FourthFragment;
import com.riteshmaagadh.myinterviewtask.fragments.SecondFragment;
import com.riteshmaagadh.myinterviewtask.fragments.SixthFragment;
import com.riteshmaagadh.myinterviewtask.fragments.ThirdFragment;

public class FragmentAdapter extends FragmentStateAdapter {


    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            case 4:
                return new FifthFragment();
            case 5:
                return new SixthFragment();
        }
        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
