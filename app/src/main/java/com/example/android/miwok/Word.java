    package com.example.android.miwok;

    /**
     * Created by hakeem on 7/9/17.
     */

    public class Word {
        private String mDefaultTranslate;
        private String mMiwokTranslate;
        /** Constant value that represents no image was provided for this word */
        private static final int NO_IMAGE_PROVIDED = -1;
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private int audioFileId;



        public Word(String defaultTranslation, String miwokTranslation, int audioID) {
            mDefaultTranslate = defaultTranslation;
            mMiwokTranslate = miwokTranslation;
            audioFileId = audioID;
        }

        public Word(String defaultTranslation, String miwokTranslation , int imageID, int audioID) {
            mDefaultTranslate = defaultTranslation;
            mMiwokTranslate = miwokTranslation;
            mImageResourceId = imageID;
            audioFileId = audioID;
        }
        /**
         * Get the default translation of the word.
         */
        public String getDefaultTranslation() {
            return mDefaultTranslate;
        }

        /**
         * Get the Miwok translation of the word.
         */
        public String getMiwokTranslation() {
            return mMiwokTranslate;
        }

        public int getImageResourceId() {
            return mImageResourceId;
        }


        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

        public int getAudioResourceID()
        {
            return audioFileId;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "mDefaultTranslate='" + mDefaultTranslate + '\'' +
                    ", mMiwokTranslate='" + mMiwokTranslate + '\'' +
                    ", mImageResourceId=" + mImageResourceId +
                    ", audioFileId=" + audioFileId +
                    '}';
        }
    }


