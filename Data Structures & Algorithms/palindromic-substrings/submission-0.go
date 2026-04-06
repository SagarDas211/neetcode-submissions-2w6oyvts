func countSubstrings(s string) int {
    overalCount := 0

    expand := func(l int, r int) int {
        count := 0
        for l>= 0 && r < len(s) && s[l] == s[r] {
            count++
            l--
            r++
        }

        return count
    }    

    for i := 0; i < len(s); i++{
        l1 := expand(i, i)
        l2 := expand(i, i+1)

        overalCount = overalCount + l1 + l2
    }

    return overalCount

}
