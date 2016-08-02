package com.christianchiang.flickerbrowser;

/**
 * Created by Christian on 8/1/2016.
 */

enum DownloadStatus { IDLE, PROCESSING, NOT_INTIALISED, FAILED_OR_EMPTY, OK }

public class GetRawData {
    private String LOG_TAG = GetRawData.class.getSimpleName();
    private String mRawURL;
    private String mData;
    private DownloadStatus mDownloadStatus;

    public GetRawData(String mRawURL) {
        this.mRawURL = mRawURL;
    }
}
