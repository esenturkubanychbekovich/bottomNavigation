package com.esenkubanychbekov.lesson_7.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esenkubanychbekov.lesson_7.R;
import com.esenkubanychbekov.lesson_7.adapter.HomeAdapter;
import com.esenkubanychbekov.lesson_7.adapter.ListAdapter;
import com.esenkubanychbekov.lesson_7.databinding.FragmentCoinBinding;
import com.esenkubanychbekov.lesson_7.model.Home;

import java.util.ArrayList;


public class CoinFragment extends Fragment {
    private ArrayList<Home> list, list2;
    private FragmentCoinBinding binding;

    int icons[] = {R.drawable.cr7, R.drawable.zidan, R.drawable.mo_salah, R.drawable.serhio_ramos,
            R.drawable.garey, R.drawable.icer, R.drawable.karim};
    String iconsName[] = {"Ronaldo", "Zidane", "Salah", "Ramos", "Bale", "Icer", "Benzema"};

    int listIcons[] = {R.drawable.qsport, R.drawable.audi, R.drawable.background, R.drawable.background};
    String listIconsName[] = {"\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F Англия Премьер-лигасынын 11-туру Q Sport Arena телеканалынын түз эфиринде\n" +
            "\n" +
            "Андан сырткары күйөрмандар АПЛ-дин көбүрөөк беттешин көрүш үчүн Q Sport Arena параллель боло турган «Кристал Пэлас» – «Вулверхэмптон» жана «Эвертон» – «Тоттенхэм» беттештерин көрсөтүү укугун КТРК Спорт телеканалына берет.\n" +
            "\n" +
            "\uD83D\uDE0D 11-й тур АПЛ в прямом эфире на телеканале Q Sport Arena\n" +
            "\n" +
            "Также Q Sport Arena предоставит права показа параллельных матчей «Кристал Пэлас» – «Вулверхэмптон» и «Эвертон» – «Тоттенхэм» телеканалу КТРК Спорт, чтобы большее количество телезрителей смогли посмотреть АПЛ." +
            "\n",
            "Марка: Volkswagen Passat B5 Рестайлинг" +
            "Год выпуска: 2001\n" +
            "Объём двигателя: 1.8\n" +
            "КПП: Механика\n" +
            "Левый руль\n" +
            "Цвет: Черный\n" +
            "Кузов: Седан\n" +
            "Салон: Комби кожа\n" +
            "Авто в хорошем состоянии!\n" +
            "Учёт Россия \uD83C\uDDF7\uD83C\uDDFA (железные номера)\n" +
            "\n" +
            "Цена 2500$ окончательно!!!\n" +
            "\n" +
            "Осмотр г. Бишкек",
            "The game in Japan was amazing and want to share some photos", "The game in Japan was amazing and want to share some photos"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCoinBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
        setListData();
    }

    private void setData() {
        list = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            Home home = new Home();
            home.setImage(icons[i]);
            home.setName(iconsName[i]);
            list.add(home);
            HomeAdapter adapter = new HomeAdapter(getContext(), list);
            binding.mainRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
            binding.mainRecyclerView.setItemAnimator(new DefaultItemAnimator());
            binding.mainRecyclerView.setAdapter(adapter);
        }
    }

    private void setListData() {
        list2 = new ArrayList<>();
        for (int i = 0; i < listIcons.length; i++) {
            Home home = new Home();
            home.setImage(listIcons[i]);
            home.setName(listIconsName[i]);
            list2.add(home);
            ListAdapter adapter = new ListAdapter(getContext(), list2);
            binding.listRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.listRecyclerView.setAdapter(adapter);
        }
    }
}