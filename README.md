# Jepeto

A compiler for Jepeto programming language.

# What is Jepeto?

Jepeto is designed for educational purposes at ECE college, University of Tehran;
it is inspired by the _ML_ programming language, and follows a declarative coding style.

# Sample Program in Jepeto

```python
main : k(155, true, "str");

func f(a, b) : {
    print([a, b, a, b, b, b][b] * -2);
    return 13;
}

func g() : {
    return f;
}

func h():{
    return void;
}

func r():{
    return ()->{print("PLC_1400");return "CLP";};
}

func k(arg1, arg2, arg3) :{
    h();
    g()(arg1, 2);
    if (~arg2):
        return arg3;
    else:
        print((a, b)->{print(a);print(f(20, 1));return 1;}(arg3, arg3));

    r()();
    return "true";
}
```

## Sample Output

```Compilation successful
-------------------Generating Class Files-------------------
Generated: Fptr.class
Generated: List.class
Generated: Main.class

---------------------------Output---------------------------
-310
str
-2
13
1
PLC_1400
```

# How we Implemented This

The implementation was broken into 4 phases:

1. Grammar specification
2. Name analysis
3. Type analysis and inference
4. Translation to bytecode

The compiler itself is written in the lovely environment of Java!

![With Pain!](assets/troll-troll-sad.gif)
