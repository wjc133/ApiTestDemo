#include <jni.h>
#include "HelloJni.h"
#include <stdio.h>

/*
 * Class:     com_elite_jni_HelloJni
 * Method:    display
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_elite_jni_HelloJni_display
  (JNIEnv *env, jobject obj){
      printf("hello world wjc133");
}

/*
 * Class:     com_elite_jni_HelloJni
 * Method:    setName
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_elite_jni_HelloJni_setName
  (JNIEnv *env, jobject obj, jstring str){
  }