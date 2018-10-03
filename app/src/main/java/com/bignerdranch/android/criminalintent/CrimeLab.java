package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.List;

public class CrimeLab
{
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context)
    {
        if (sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context)
    {

    }
}
