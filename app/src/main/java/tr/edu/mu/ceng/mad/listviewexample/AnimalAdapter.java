package tr.edu.mu.ceng.mad.listviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private List<Animal> animals;
    private LayoutInflater inflater;

    public AnimalAdapter(List<Animal> animals, Activity activity) {
        this.animals = animals;
        inflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView;

        rowView = inflater.inflate(R.layout.listview_row, null);
        TextView textView = rowView.findViewById(R.id.label);
        textView.setText(animals.get(position).getType());

        ImageView imageView = rowView.findViewById(R.id.imageView);
        imageView.setImageResource(animals.get(position).getPictureId());

        return rowView;
    }
}
