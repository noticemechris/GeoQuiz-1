package org.overlake.mat803.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAlwaysCheater;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAlwaysCheater = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean AnswerTrue) {
        mAnswerTrue = AnswerTrue;
    }

    public void setAlwaysCheater() {
        mAlwaysCheater = true;
    }

    public boolean getAlwaysCheater() {
        return mAlwaysCheater;
    }
}
