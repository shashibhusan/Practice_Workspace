// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dealer.proto

package com.shashi.models;

public final class DealerOuterClass {
  private DealerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_ModelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_ModelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014dealer.proto\032\020common/car.proto\"i\n\006Deal" +
      "er\022#\n\006models\030\001 \003(\0132\023.Dealer.ModelsEntry\032" +
      ":\n\013ModelsEntry\022\013\n\003key\030\001 \001(\005\022\032\n\005value\030\002 \001" +
      "(\0132\013.common.Car:\0028\001B\025\n\021com.shashi.models" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.shashi.models.CarOuterClass.getDescriptor(),
        });
    internal_static_Dealer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Dealer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_descriptor,
        new java.lang.String[] { "Models", });
    internal_static_Dealer_ModelsEntry_descriptor =
      internal_static_Dealer_descriptor.getNestedTypes().get(0);
    internal_static_Dealer_ModelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_ModelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.shashi.models.CarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
