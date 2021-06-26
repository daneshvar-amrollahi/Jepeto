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
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmpne Label2
		iconst_1
		goto Label3
		Label2:
		iconst_0
		Label3:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ldc 1
		ixor
		ldc 1
		iand
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		  return
		.end method
