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
		dup
		new Fptr
		dup
		aload_1
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Boolean
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		  return
		.end method
.method public f(LFptr;)Ljava/lang/Boolean;
		.limit stack 140
		.limit locals 140
		new Fptr
		dup
		aload_0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Boolean
		areturn
		.end method
.method public g(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Boolean;
		.limit stack 140
		.limit locals 140
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		if_icmpeq Label0
		iconst_1
		goto Label1
		Label0:
		iconst_0
		Label1:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		areturn
		.end method
