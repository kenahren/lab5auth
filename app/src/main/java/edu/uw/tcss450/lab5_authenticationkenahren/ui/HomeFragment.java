package edu.uw.tcss450.lab5_authenticationkenahren.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.lab5_authenticationkenahren.R;
import edu.uw.tcss450.lab5_authenticationkenahren.databinding.FragmentHomeBinding;
import edu.uw.tcss450.lab5_authenticationkenahren.databinding.FragmentRegisterBinding;
import edu.uw.tcss450.lab5_authenticationkenahren.model.UserInfoViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UserInfoViewModel model = new ViewModelProvider(getActivity())
                .get(UserInfoViewModel.class);

        FragmentHomeBinding.bind(getView()).textHello.setText("Hello " + model.getEmail());
    }
}
