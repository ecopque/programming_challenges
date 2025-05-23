// ### **Entendendo o Problema**
// Você precisa gerar séries numéricas baseadas em fórmulas matemáticas para múltiplas consultas (queries). Cada consulta fornece três valores (`a`, `b`, `n`), e você deve calcular uma série de `n` termos seguindo uma regra específica.

// ---

// ### **Como a Série é Calculada?**
// Para cada consulta com valores `(a, b, n)`, a série é construída da seguinte forma:

// - **Termo 0 (s₀)**: `a + 2⁰ * b`  
// - **Termo 1 (s₁)**: `a + 2⁰ * b + 2¹ * b`  
// - **Termo 2 (s₂)**: `a + 2⁰ * b + 2¹ * b + 2² * b`  
// - ...  
// - **Termo n-1 (sₙ₋₁)**: `a + 2⁰ * b + 2¹ * b + ... + 2ⁿ⁻¹ * b`

// #### **Fórmula Geral**:
// Cada termo `sᵢ` na série é a soma de `a` com a soma dos primeiros `i+1` termos da forma `2^k * b` (onde `k` vai de `0` a `i`).

// ---

// ### **Exemplo do Cálculo**
// #### **Consulta 1**: `a=0`, `b=2`, `n=10`
// | Termo (i) | Cálculo                           | Resultado |
// |-----------|-----------------------------------|-----------|
// | s₀        | 0 + 2⁰ * 2 = 0 + 1*2 =            | **2**     |
// | s₁        | 0 + 2⁰ * 2 + 2¹ * 2 = 0 + 2 + 4 = | **6**     |
// | s₂        | 0 + 2 + 4 + 8 =                   | **14**    |
// | ...       | ...                               | ...       |
// | s₉        | (soma até 2⁹ * 2)                 | **2046**  |

// **Saída**: `2 6 14 30 62 126 254 510 1022 2046`

// ---

// #### **Consulta 2**: `a=5`, `b=3`, `n=5`
// | Termo (i) | Cálculo                           | Resultado |
// |-----------|-----------------------------------|-----------|
// | s₀        | 5 + 1*3 =                         | **8**     |
// | s₁        | 5 + 3 + 6 =                       | **14**    |
// | s₂        | 5 + 3 + 6 + 12 =                  | **26**    |
// | s₃        | 5 + 3 + 6 + 12 + 24 =             | **50**    |
// | s₄        | 5 + 3 + 6 + 12 + 24 + 48 =        | **98**    |

// **Saída**: `8 14 26 50 98`

// ---

