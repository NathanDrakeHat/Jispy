package org.nathan.interpreter;

import com.google.common.primitives.Doubles;
import org.apache.commons.math3.complex.Complex;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

class NumericOperators {

    static boolean lessThan(@NotNull Object a, @NotNull Object b) {
        return value(a) < value(b);
    }

    static boolean lessOrEqual(@NotNull Object a, @NotNull Object b) {
        return value(a) <= value(b);
    }

    static boolean equal(@NotNull Object a, @NotNull Object b) {
        if ((!(a instanceof Complex)) && (!(b instanceof Complex))) {
            return value(a) == value(b);
        }
        else {
            return a.equals(b);
        }
    }

    static @NotNull Object negative(@NotNull Object a) {
        if (a instanceof Integer) { return -(Integer) a; }
        else if (a instanceof Double) { return -(Double) a; }
        else if (a instanceof Complex) { return ((Complex) a).negate(); }
        else { throw new SyntaxException("not number"); }

    }

    static @NotNull Object plus(@NotNull Object a, @NotNull Object b) {
        if (a instanceof Integer) {
            if (b instanceof Integer) {
                Integer c = (Integer) (a);
                Integer d = (Integer) (b);
                return c + d;
            }
            else if (b instanceof Double) {
                Integer c = (Integer) (a);
                Double d = (Double) (b);
                return c + d;
            }
            else if (b instanceof Complex) {
                Integer c = (Integer) (a);
                return ((Complex) b).add(c);
            }
            else { throw new SyntaxException("not number"); }

        }
        else if (a instanceof Double) {
            if (b instanceof Integer) {
                Double c = (Double) (a);
                Integer d = (Integer) (b);
                return c + d;
            }
            else if (b instanceof Double) {
                Double c = (Double) (a);
                Double d = (Double) (b);
                return c + d;
            }
            else if (b instanceof Complex) {
                Double c = (Double) a;
                return ((Complex) b).add(c);
            }
            else { throw new SyntaxException("not number"); }

        }
        else if (a instanceof Complex) {
            if (b instanceof Integer) {
                Complex c = (Complex) (a);
                Integer d = (Integer) (b);
                return c.add(d);
            }
            else if (b instanceof Double) {
                Complex c = (Complex) (a);
                Double d = (Double) (b);
                return c.add(d);
            }
            else if (b instanceof Complex) {
                Complex c = (Complex) (a);
                return ((Complex) b).add(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else { throw new SyntaxException("not number"); }
    }

    static @NotNull Object minus(@NotNull Object a, @NotNull Object b) {
        if (a instanceof Integer) {
            if (b instanceof Integer) {
                Integer c = (Integer) (a);
                Integer d = (Integer) (b);
                return c - d;
            }
            else if (b instanceof Double) {
                Integer c = (Integer) (a);
                Double d = (Double) (b);
                return c - d;
            }
            else if (b instanceof Complex) {
                Integer c = (Integer) (a);
                Complex d = (Complex) b;
                return d.negate().add(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Double) {
            if (b instanceof Integer) {
                Double c = (Double) (a);
                Integer d = (Integer) (b);
                return c - d;
            }
            else if (b instanceof Double) {
                Double c = (Double) (a);
                Double d = (Double) (b);
                return c - d;
            }
            else if (b instanceof Complex) {
                Double c = (Double) (a);
                Complex d = (Complex) b;
                return d.negate().add(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Complex) {
            if (b instanceof Integer) {
                Complex c = (Complex) (a);
                Integer d = (Integer) (b);
                return c.negate().add(d).negate();
            }
            else if (b instanceof Double) {
                Complex c = (Complex) (a);
                Double d = (Double) (b);
                return c.negate().add(d).negate();
            }
            else if (b instanceof Complex) {
                Complex c = (Complex) (a);
                Complex d = (Complex) b;
                return c.negate().add(d).negate();
            }
            else { throw new SyntaxException("not number"); }
        }
        else { throw new SyntaxException("not number"); }
    }

    static @NotNull Object divide(@NotNull Object a, @NotNull Object b) {
        if (a instanceof Integer) {
            if (b instanceof Integer) {
                Integer c = (Integer) (a);
                Integer d = (Integer) (b);
                return c / d;
            }
            else if (b instanceof Double) {
                Integer c = (Integer) (a);
                Double d = (Double) (b);
                return c / d;
            }
            else if (b instanceof Complex) {
                Integer c = (Integer) (a);
                Complex d = (Complex) (b);
                return new Complex(1).divide(d.divide(c));
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Double) {
            if (b instanceof Integer) {
                Double c = (Double) (a);
                Integer d = (Integer) (b);
                return c / d;
            }
            else if (b instanceof Double) {
                Double c = (Double) (a);
                Double d = (Double) (b);
                return c / d;
            }
            else if (b instanceof Complex) {
                Double c = (Double) (a);
                Complex d = (Complex) (b);
                return new Complex(1).divide(d.divide(c));
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Complex) {
            if (b instanceof Integer) {
                Complex c = (Complex) (a);
                Integer d = (Integer) (b);
                return c.divide(d);
            }
            else if (b instanceof Double) {
                Complex c = (Complex) (a);
                Double d = (Double) (b);
                return c.divide(d);
            }
            else if (b instanceof Complex) {
                Complex c = (Complex) (a);
                Complex d = (Complex) (b);
                return c.divide(d);
            }
            else { throw new SyntaxException("not number"); }
        }
        else { throw new SyntaxException("not number"); }
    }

    static @NotNull Object multiply(@NotNull Object a, @NotNull Object b) {
        if (a instanceof Integer) {
            if (b instanceof Integer) {
                Integer c = (Integer) (a);
                Integer d = (Integer) (b);
                return c * d;
            }
            else if (b instanceof Double) {
                Integer c = (Integer) (a);
                Double d = (Double) (b);
                return c * d;
            }
            else if (b instanceof Complex) {
                Integer c = (Integer) (a);
                Complex d = (Complex) (b);
                return d.multiply(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Double) {
            if (b instanceof Integer) {
                Double c = (Double) (a);
                Integer d = (Integer) (b);
                return c * d;
            }
            else if (b instanceof Double) {
                Double c = (Double) (a);
                Double d = (Double) (b);
                return c * d;
            }
            else if (b instanceof Complex) {
                Double c = (Double) (a);
                Complex d = (Complex) (b);
                return d.multiply(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else if (a instanceof Complex) {
            if (b instanceof Integer) {
                Complex c = (Complex) (a);
                Integer d = (Integer) (b);
                return c.multiply(d);
            }
            else if (b instanceof Double) {
                Complex c = (Complex) (a);
                Double d = (Double) (b);
                return c.multiply(d);
            }
            else if (b instanceof Complex) {
                Complex c = (Complex) (a);
                Complex d = (Complex) (b);
                return d.multiply(c);
            }
            else { throw new SyntaxException("not number"); }
        }
        else { throw new SyntaxException("not number"); }
    }

    static double value(@NotNull Object o) {
        if (o instanceof Double) { return (Double) o; }
        else if (o instanceof Integer) { return (Integer) o; }
        else { throw new SyntaxException("not number"); }
    }

    static Optional<Complex> tryParseComplex(@NotNull String source) {
        String[] parts = source.split("\\+");
        Double real = null, imaginary = null;
        if (parts.length == 0) {
            return Optional.empty();
        }
        for (var part : parts) {
            var s = part.trim();
            if (s.contains("i")) {
                s = s.replaceAll("i", "");
                try {
                    imaginary = Double.parseDouble(s);
                }
                catch (NumberFormatException ignore) {}
            }
            else {
                try {
                    real = Double.parseDouble(s);
                }
                catch (NumberFormatException ignore) {}
            }
        }
        if (real == null && imaginary == null) {
            return Optional.empty();
        }
        else if (real == null) {
            return Optional.of(new Complex(0, imaginary));
        }
        else if (imaginary == null) {
            return Optional.of(new Complex(real, 0));
        }
        else {
            return Optional.of(new Complex(real, imaginary));
        }
    }

    static Optional<Double> tryParseDouble(@NotNull String s) {
        @SuppressWarnings("UnstableApiUsage") Double d = Doubles.tryParse(s);
        if (d == null) {
            return Optional.empty();
        }
        else {
            return Optional.of(d);
        }
    }
}
