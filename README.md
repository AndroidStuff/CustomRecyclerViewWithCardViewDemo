# CustomRecyclerViewWithCardViewDemo

## About

This project is a better version of [CustomListViewDemo](https://github.com/AndroidStuff/CustomListViewDemo/tree/master_gradlized).

But how? This project uses RecyclerView instead of ListView; and used CardView as View Group or layout for the row of a list.

This project's purpose is to demo how to use RecyclerView with CardView.

Starting with Android Lollipop, Google introduced two new cool widgets that we're demoing in this project. With the **v7 Support Library**, you can use the **RecyclerView** and **CardView** widgets on devices that run older versions of Android.

RecyclerView is a better replacement to ListView for its performance.


## Notes on RecyclerView
- A flexible view for providing a limited window into a large data set. The `RecyclerView` widget is a more advanced and flexible version of `ListView`.
- This widget is a container for displaying large data sets that can be scrolled very efficiently by maintaining a limited number of views.
- Use the `RecyclerView` widget when you have data collections whose elements change at runtime based on user action or network events.
- To use the `RecyclerView` widget, you have to specify:
    - **An Adapter**
        - To create an adapter, extend the `RecyclerView.Adapter` class.
    - **A Layout Manager**
        - A layout manager positions item views inside a RecyclerView and determines when to reuse item views that are no longer visible to the user.
        - To reuse (or recycle) a view, a layout manager may ask the adapter to replace the contents of the view with a different element from the dataset. Recycling views in this manner improves performance by avoiding the creation of unnecessary views or performing expensive findViewById() lookups.
        - `RecyclerView` provides these built-in layout managers:
          - `LinearLayoutManager` shows items in a vertical or horizontal scrolling list.
          - `GridLayoutManager` shows items in a grid.
          - `StaggeredGridLayoutManager` shows items in a staggered grid.
        - To create a custom layout manager, extend the `RecyclerView.LayoutManager class.
  - **Animations** for adding and removing items are enabled by default in `RecyclerView`. To customize these animations, extend the `RecyclerView.ItemAnimator` class and use the `RecyclerView.setItemAnimator()` method.

## References
* [Android's Developer Training - Creating Lists and Cards](http://developer.android.com/training/material/lists-cards.html): To create complex lists and cards with material design styles in your apps, you can use the `RecyclerView` and `CardView` widgets..
* [Getting Started With RecyclerView and CardView on Android](http://code.tutsplus.com/tutorials/getting-started-with-recyclerview-and-cardview-on-android--cms-23465) whose demo-code can be found at [Github](https://github.com/tutsplus/Android-CardViewRecyclerView). Thanks to **Hathibelagal Ashraff** for writing up a good tutorial on using RecyclerView and CardView
* [Using lists and grids in Android with RecylerView - Tutorial](http://www.vogella.com/tutorials/AndroidRecyclerView/article.html)
