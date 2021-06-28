.class public List
.super java/lang/Object

.field public elements Ljava/util/ArrayList;
  .signature "Ljava/util/ArrayList<Ljava/lang/Object;>;"
  .end field

.method public <init>(Ljava/util/ArrayList;)V
  .limit stack 3
  .limit locals 4
  .var 0 is this LList; from Label0 to Label52
  .var 1 is newElements Ljava/util/ArrayList; signature "Ljava/util/ArrayList<Ljava/lang/Object;>;" from Label0 to Label52
  .var 3 is newElement Ljava/lang/Object; from Label36 to Label49
Label0:
  .line 9
  0: aload_0
  1: invokespecial java/lang/Object/<init>()V
  .line 10
  4: aload_0
  5: new java/util/ArrayList
  8: dup
  9: invokespecial java/util/ArrayList/<init>()V
  12: putfield List/elements Ljava/util/ArrayList;
  .line 11
  15: aload_1
  16: invokevirtual java/util/ArrayList/iterator()Ljava/util/Iterator;
  19: astore_2
Label20:
  20: aload_2
  21: invokeinterface java/util/Iterator/hasNext()Z 1
  26: ifeq Label52
  29: aload_2
  30: invokeinterface java/util/Iterator/next()Ljava/lang/Object; 1
  35: astore_3
Label36:
  .line 12
  36: aload_0
  37: getfield List/elements Ljava/util/ArrayList;
  40: aload_0
  41: aload_3
  42: invokevirtual List/getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  45: invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
  48: pop
Label49:
  49: goto Label20
Label52:
  .line 13
  52: return
  ; full_frame (frameNumber = 0)
  ; frame_type = 255, offset_delta = 20
  ; frame bytes: 255 0 20 0 3 7 0 11 7 0 7 7 0 21 0 0 
  .stack 
    offset 20
    locals Object List
    locals Object java/util/ArrayList
    locals Object java/util/Iterator
    .end stack
  ; chop_frame (frameNumber = 1)
  ; frame_type = 250, offset_delta = 31
  ; frame bytes: 250 0 31 
  .stack 
    offset 52
    locals Object List
    locals Object java/util/ArrayList
    .end stack
  .signature "(Ljava/util/ArrayList<Ljava/lang/Object;>;)V"
.end method

.method public <init>(LList;)V
  .limit stack 2
  .limit locals 2
  .var 0 is this LList; from Label0 to Label8
  .var 1 is that LList; from Label0 to Label8
Label0:
  .line 16
  0: aload_0
  1: aload_1
  2: getfield List/elements Ljava/util/ArrayList;
  5: invokespecial List/<init>(Ljava/util/ArrayList;)V
Label8:
  .line 17
  8: return
.end method

.method private getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  .limit stack 3
  .limit locals 2
  .var 0 is this LList; from Label0 to Label20
  .var 1 is o Ljava/lang/Object; from Label0 to Label20
Label0:
  .line 20
  0: aload_1
  1: instanceof List
  4: ifeq Label19
  .line 21
  7: new List
  10: dup
  11: aload_1
  12: checkcast List
  15: invokespecial List/<init>(LList;)V
  18: areturn
Label19:
  .line 23
  19: aload_1
Label20:
  20: areturn
  ; same_frame (frameNumber = 0)
  ; frame_type = 19, offset_delta = 19
  ; frame bytes: 19 
  .stack 
    offset 19
    .end stack
.end method

.method public getElement(I)Ljava/lang/Object;
  .limit stack 2
  .limit locals 2
  .var 0 is this LList; from Label0 to Label8
  .var 1 is index I from Label0 to Label8
Label0:
  .line 27
  0: aload_0
  1: getfield List/elements Ljava/util/ArrayList;
  4: iload_1
  5: invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
Label8:
  8: areturn
.end method

.method public getSize()I
  .limit stack 1
  .limit locals 1
  .var 0 is this LList; from Label0 to Label7
Label0:
  .line 30
  0: aload_0
  1: getfield List/elements Ljava/util/ArrayList;
  4: invokevirtual java/util/ArrayList/size()I
Label7:
  7: ireturn
.end method

.method public addElement(Ljava/lang/Object;)V
  .limit stack 3
  .limit locals 2
  .var 0 is this LList; from Label0 to Label13
  .var 1 is o Ljava/lang/Object; from Label0 to Label13
Label0:
  .line 32
  0: aload_0
  1: getfield List/elements Ljava/util/ArrayList;
  4: aload_0
  5: aload_1
  6: invokevirtual List/getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  9: invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
  12: pop
Label13:
  13: return
.end method

.method public toString()Ljava/lang/String;
  .limit stack 3
  .limit locals 4
  .var 0 is this LList; from Label0 to Label68
  .var 1 is res Ljava/lang/StringBuilder; from Label10 to Label68
  .var 2 is flag Z from Label12 to Label68
  .var 3 is i I from Label14 to Label57
Label0:
  .line 35
  0: new java/lang/StringBuilder
  3: dup
  4: ldc "["
  6: invokespecial java/lang/StringBuilder/<init>(Ljava/lang/String;)V
  9: astore_1
Label10:
  .line 36
  10: iconst_0
  11: istore_2
Label12:
  .line 37
  12: iconst_0
  13: istore_3
Label14:
  14: iload_3
  15: aload_0
  16: getfield List/elements Ljava/util/ArrayList;
  19: invokevirtual java/util/ArrayList/size()I
  22: if_icmpge Label57
  .line 38
  25: iload_2
  26: ifeq Label36
  .line 39
  29: aload_1
  30: ldc ","
  32: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  35: pop
Label36:
  .line 40
  36: iconst_1
  37: istore_2
  .line 41
  38: aload_1
  39: aload_0
  40: getfield List/elements Ljava/util/ArrayList;
  43: iload_3
  44: invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
  47: invokevirtual java/lang/StringBuilder/append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
  50: pop
  .line 37
  51: iinc 3 1
  54: goto Label14
Label57:
  .line 43
  57: aload_1
  58: ldc "]"
  60: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  63: pop
  .line 44
  64: aload_1
  65: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
Label68:
  68: areturn
  ; append_frame (frameNumber = 0)
  ; frame_type = 254, offset_delta = 14
  ; frame bytes: 254 0 14 7 0 52 1 1 
  .stack 
    offset 14
    locals Object java/lang/StringBuilder
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 21, offset_delta = 21
  ; frame bytes: 21 
  .stack 
    offset 36
    locals Object java/lang/StringBuilder
    locals Integer
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 2)
  ; frame_type = 250, offset_delta = 20
  ; frame bytes: 250 0 20 
  .stack 
    offset 57
    locals Object java/lang/StringBuilder
    locals Integer
    .end stack
.end method


