.class public Main
		.super java/lang/Object
.method public <init>()V
		.limit stack 140
		.limit locals 140
		aload_0
		invokespecial java/lang/Object/<init>()V
		return
		.end method
.method public static main([Ljava/lang/String;)V
		  .limit stack 140
		  .limit locals 140
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 85
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ineg
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 32
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 64
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 11
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		  return
		.end method
