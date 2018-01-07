package com.swstylez.nytarticlesearch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jndukuba on 1/6/2018.
 */

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private List<Article> articles;

    private Context context;

    public ArticlesAdapter(Context context, List<Article> articles) {
        this.context = context;
        this.articles = articles;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView articleImageView;
        TextView blurbTextView;

        public ViewHolder(View itemView) {

            super(itemView);

            articleImageView = (ImageView) itemView.findViewById(R.id.articleImageView);
            blurbTextView = (TextView) itemView.findViewById(R.id.subjecTextView);

        }

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Article article = articles.get(position);
        TextView blurbTextView = holder.blurbTextView;

        blurbTextView.setText(article.getLeadParagraph());

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View articleView = inflater.inflate(R.layout.item_article, parent, false);

        return new ViewHolder(articleView);

    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    private Context getContext() {
        return context;
    }

}
