#include <jni.h>

extern JNIEXPORT jstring JNICALL
Java_com_tamarack_bridge_Native_stringFromJNI(
        JNIEnv* env,
        jobject thiz)
{
    return (*env)->NewStringUTF(env, "hmm");
}