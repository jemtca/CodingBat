
# given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation
# return a string of the form "7:00" indicating when the alarm clock should ring
# weekdays, the alarm should be "7:00" and on the weekend it should be "10:00"
# unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off"
def alarm_clock(day, vacation):
    new_string = ''

    if not vacation and day >= 1 and day <= 5:
        new_string = '7:00'
    elif (not vacation and (day == 0 or day == 6)) or (vacation and day >= 1 and day <= 5):
        new_string = '10:00'
    elif vacation and day == 0 or day == 6:
        new_string = 'off'

    return new_string

print(alarm_clock(1, False))
print(alarm_clock(5, False))
print(alarm_clock(0, False))
