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
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifne Label0
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		goto Label1
		Label0:
		iconst_1
		Label1:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		  return
		.end method
