package com.ebookfrenzy.masterdetailflow.SiteData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class SiteList {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<SiteItem> ITEMS = new ArrayList<SiteItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, SiteItem> ITEM_MAP = new HashMap<String, SiteItem>();

    static {
        // Add 4 sample items.
        addItem(new SiteItem("1", "eBookFrenzy", "http://www.ebookfrenzy.com"));
        addItem(new SiteItem("2", "Amazon", "http://www.amazon.com"));
        addItem(new SiteItem("3", "Wikipedia", "https://www.wikipedia.org"));
        addItem(new SiteItem("4", "St. Scholastica", "http://www.css.edu"));
    }

    private static void addItem(SiteItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static SiteItem createDummyItem(int position) {
        return new SiteItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class SiteItem {
        public final String id;
        public final String website_name;
        public final String website_url;

        public SiteItem(String id, String website_name, String website_url) {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_name;
        }
    }
}
