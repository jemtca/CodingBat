
# when squirrels get together for a party, they like to have cigars
# a squirrel party is successful when the number of cigars is between 40 and 60, inclusive
# unless it is the weekend, in which case there is no upper bound on the number of cigars
# return true if the party with the given values is successful, or false otherwise
def cigar_party(cigars, is_weekend):
    b = False

    if not is_weekend and cigars >= 40 and cigars <= 60:
        b = True
    elif is_weekend and cigars >= 40:
        b = True

    return b

print(cigar_party(30, False))
print(cigar_party(50, False))
print(cigar_party(60, True))
