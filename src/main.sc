require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Добрый день! Я - учебный проект Ячменева Михаила. Этот рукожоп ничего толком не умеет, поэтому просто поздаровайтесь со мной и уходите...

    state: Hello
        intent!: /привет
        a: Привет привет
        
    state: CustomHello
        q!: * (даров/ку/дратути/здрасьте)*
        a: О, привет!

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Какого графа?!
        a: Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}