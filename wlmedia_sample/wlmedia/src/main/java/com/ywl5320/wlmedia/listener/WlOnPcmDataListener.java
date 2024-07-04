package com.ywl5320.wlmedia.listener;

/**
 * author : ywl5320
 * e-mail : ywl5320@163.com
 * desc   : wlmedia
 * date   : 2024/6/2
 */
public interface WlOnPcmDataListener {

    /**
     * 回调pcm信息
     * @param bit 采样位数
     * @param channel 声道数
     * @param samplerate 采样率
     */
    void onPcmInfo(int bit, int channel, int samplerate);

    /**
     * 回调pcm数据 注：此接口和音频播放位于同一线程，尽量不要做耗时操作
     * 如果需要耗时操作，建议使用队列缓存后处理！
     * @param size pcm数据大小
     * @param data pcm数据 （播放时间计算：double time = size / (samplerate * 2 * 2))
     */
    void onPcmData(int size, byte[] data, double db);

}
