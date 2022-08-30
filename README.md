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
