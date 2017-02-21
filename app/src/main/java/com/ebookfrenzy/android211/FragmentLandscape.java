package com.ebookfrenzy.android211;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ebookfrenzy.android211.R;

/**
 * Created by sergio on 2/21/2017.
 */

public class FragmentLandscape extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.landscape_fragment,container,false);
    }
}
