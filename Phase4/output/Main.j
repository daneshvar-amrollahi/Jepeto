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
		new Main
		dup
		invokespecial Main/<init>()V
		astore_1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_1
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		new Fptr
		dup
		aload_1
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		new Fptr
		dup
		aload_1
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		  return
		.end method
.method public g()Ljava/lang/Integer;
		.limit stack 140
		.limit locals 140
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "--inside g"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
.method public f()Ljava/lang/Integer;
		.limit stack 140
		.limit locals 140
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "--inside f"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 4559
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore 137
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "["
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		iconst_0
		istore 139
		Label0:
		iconst_0
		istore 138
		Label1:
		iload 138
		aload 137
		invokevirtual List/getSize()I
		if_icmpge Label2
		iload 139
		ifeq Label3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc ","
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		Label3:
		iconst_1
		istore 139
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 137
		iload 138
		invokevirtual List/getElement(I)Ljava/lang/Object;
		invokevirtual java/io/PrintStream/print(Ljava/lang/Object;)V
		iinc 138 1
		goto Label1
		Label2:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "]"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ineg
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ineg
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 5669
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore 137
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "["
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		iconst_0
		istore 139
		Label4:
		iconst_0
		istore 138
		Label5:
		iload 138
		aload 137
		invokevirtual List/getSize()I
		if_icmpge Label6
		iload 139
		ifeq Label7
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc ","
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		Label7:
		iconst_1
		istore 139
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 137
		iload 138
		invokevirtual List/getElement(I)Ljava/lang/Object;
		invokevirtual java/io/PrintStream/print(Ljava/lang/Object;)V
		iinc 138 1
		goto Label5
		Label6:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "]"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		
		new Fptr
		dup
		aload_0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
.method public h(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 140
		.limit locals 140
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
