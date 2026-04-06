// func longestPalindrome(s string) string {
    
// }
func longestPalindrome(s string) string {
    if len(s) < 1 {
        return ""
    }
    
    start, maxLen := 0, 0

    // Helper to expand and return the length of the palindrome
    expand := func(l, r int) int {
        for l >= 0 && r < len(s) && s[l] == s[r] {
            l--
            r++
        }
        // Length of the palindrome is r - l - 1
        return r - l - 1
    }

    for i := 0; i < len(s); i++ {
        // Case 1: Odd length (center is s[i])
        len1 := expand(i, i)
        // Case 2: Even length (center is between s[i] and s[i+1])
        len2 := expand(i, i+1)

        // Use the larger of the two
        currentLen := len1
        if len2 > len1 {
            currentLen = len2
        }

        if currentLen > maxLen {
            maxLen = currentLen
            // Calculate start index based on center i and total length
            start = i - (currentLen-1)/2
        }
    }

    return s[start : start+maxLen]
}
